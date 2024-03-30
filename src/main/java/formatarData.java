
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class formatarData {
    
    public static int formatar(String dataF){
        
        Date dataNascimento = null;
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            dataNascimento = formatoData.parse(dataF);
            
        } catch (Exception e) {
            /* QUANOD DEIXA TODOS OS CAMPOS VAZIOS ELE ACIONA ISSO PRIMEIRO,
               POR ISSO COLOQUEI PARA MOSTRAR ESSA MENSAGEM PORÉM FUNCIONA */
             JOptionPane.showMessageDialog(null, " PREENCHA OS DADOS!" ,"ALERTA" , JOptionPane.ERROR_MESSAGE);
        }
        
        Calendar hoje = Calendar.getInstance();
        hoje.getTime();
        
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.setTime(dataNascimento);
        
        int idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
        
        if (hoje.get(Calendar.MONTH) < dataNasc.get(Calendar.MONTH)) {
            idade--;
        }
          
        return idade;
        
    }
}
