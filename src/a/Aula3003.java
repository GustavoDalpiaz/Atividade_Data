package a;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Aula3003 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
//		CALENDAR HOJE = CALENDAR.GETINSTANCE();
//		SYSTEM.OUT.PRINTLN(HOJE);
//		INT DIA = HOJE.GET(CALENDAR.DAY_OF_MONTH); 
//		INT MES = HOJE.GET(CALENDAR.MONTH);
//		INT ANO = HOJE.GET(CALENDAR.YEAR);
//		STRING DATA = DIA + "/" + MES + "/" + ANO;
//		SYSTEM.OUT.PRINTLN("A DATA DE HOJE É : " + DATA);
//		
//		INT HORA = HOJE.GET(CALENDAR.HOUR_OF_DAY);
//		INT MINUTOS = HOJE.GET(CALENDAR.MINUTE);
//		
//		STRING AGORA = HORA + ":" + MINUTOS;
//		SYSTEM.OUT.PRINTLN("AGORA: " + AGORA);
//		// OU ENTÃO
//		SYSTEM.OUT.PRINTF("HOJE É DIA %D/%D/%D, SÃO %D HORAS E %D MINUTOS", DIA, MES, ANO, HORA, MINUTOS );
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		
		Date data1= new Date();

		System.out.println("Data formato padrão = "+data1);

		System.out.println("Data formato 1 = "+df1.format(data1));
		System.out.println("Data formato 2 = "+df2.format(data1));
		System.out.println("Data formato 3 = "+df3.format(data1));
		System.out.println("Data formato 4 = "+df4.format(data1));

	}

}
