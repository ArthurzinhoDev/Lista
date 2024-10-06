#include <ThreeWire.h> // Inclui a biblioteca ThreeWire para comunicação I2C
#include <RtcDS1302.h> // Inclui a biblioteca RTC para o chip DS1302
#include "U8glib.h" // Inclui a biblioteca U8glib para controle de displays OLED

// Inicializa a comunicação com o RTC e o display
ThreeWire myWire(4, 5, 2); // Define os pinos de comunicação I2C
RtcDS1302<ThreeWire> Rtc(myWire); // Cria um objeto RTC utilizando a comunicação ThreeWire
U8GLIB_SSD1306_128X64 u8g(U8G_I2C_OPT_NO_ACK); // Cria um objeto para o display OLED

// Array com os nomes dos dias da semana
const char* dayNames[] = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"}; 

void setup() {
    u8g.setColorIndex(1); // Define a cor do display como branco
    Rtc.Begin(); // Inicializa o RTC

    // Configura a data e hora de compilação
    RtcDateTime compiled = RtcDateTime(__DATE__, __TIME__);
    
    // Verifica se o RTC está protegido contra gravação
    if (Rtc.GetIsWriteProtected()) {
        Rtc.SetIsWriteProtected(false); // Habilita a gravação no RTC
    }

    // Verifica se o RTC está funcionando
    if (!Rtc.GetIsRunning()) {
        Rtc.SetIsRunning(true); // Inicializa o RTC se não estiver em execução
    }

    // Obtém a data e hora atuais do RTC
    RtcDateTime now = Rtc.GetDateTime();
    
    // Se o ano for 2000, configura o RTC para a data de compilação
    if (now.Year() == 2000) {
        Rtc.SetDateTime(compiled); // Define a data e hora de compilação
    }
}

void loop() {
    // Obtém a data e hora atuais do RTC
    RtcDateTime now = Rtc.GetDateTime(); 
    u8g.firstPage(); // Inicia a primeira página do display
    do {
        draw(now); // Chama a função para desenhar a data e a hora
    } while (u8g.nextPage()); // Continua até que todas as páginas sejam desenhadas
    delay(1000); // Espera 1 segundo antes de atualizar novamente
}

void draw(const RtcDateTime& dt) {
    u8g.setFont(u8g_font_8x13B); // Define a fonte para a data
    
    // Exibir a data no formato DD/MM/AAAA
    char dateString[11];
    snprintf(dateString, sizeof(dateString), "%02u/%02u/%04u", dt.Day(), dt.Month(), dt.Year());
    u8g.drawStr(5, 15, dateString); // Desenha a data na posição especificada
    
    // Calcular o dia da semana usando uma fórmula
    int dayOfWeek = (dt.Day() + ((13 * (dt.Month() + 1)) / 5) + dt.Year() + (dt.Year() / 4) - (dt.Year() / 100) + (dt.Year() / 400)) % 7;
    // Ajuste para que Domingo seja representado como 0
    dayOfWeek = (dayOfWeek + 6) % 7; 
    u8g.drawStr(100, 15, dayNames[dayOfWeek]); // Desenha o nome do dia na posição especificada

    // Exibir hora em formato 24h (sem segundos)
    u8g.setFont(u8g_font_fub30); // Define a fonte para a hora
    char timeString[6]; // Ajusta o tamanho para HH:MM
    snprintf(timeString, sizeof(timeString), "%02u:%02u", dt.Hour(), dt.Minute()); // Formata a string com a hora e os minutos
    u8g.drawStr(10, 57, timeString); // Desenha a hora na posição especificada
    
    // Desenha a moldura do relógio no display
    u8g.drawRFrame(0, 18, 128, 46, 4); // Define a moldura com posição e tamanho
}
