package lab.spring.parsing;


	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.Reader;
	import java.text.ParseException;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;

	import javax.swing.text.html.HTMLEditorKit.Parser;

	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;

import lab.spring.dao.DataDAO;
import lab.spring.model.ClassAreaVO;

	public class ClassAreaParsing {
		
		static int num = 1;
		static String code;
		
		public static String count() {		
			String suffix = String.format("%03d", num); 
			num++;
			System.out.println(num);
			return suffix;
		}


	public static void main(String[] args) throws org.json.simple.parser.ParseException {
		String[] gu = {"JG","YD","JR","YP","KC","DJ","KN","CR","YS","KJ","YC","KW",
				"SM","MP","SD","KB","SC","SP","KD","SB","DB","NW","KS","KR","DM"};

		JSONParser parser = new JSONParser();
		DataDAO dao = new DataDAO();

		int DBresult = 0;

		String[] practiceAttribute = { "key", "crcnt", "clsrarea", "phgrindrarea", "hlsparea",
				"ktchmssparea","otsparea"};
		

	
		// String[] result = new String[practiceAttribute.length];
		
		
		ClassAreaVO vo = new ClassAreaVO();
		//PracticeVO vo = new PracticeVO();
		
		for(int k=0; k<gu.length;k++) {	//gu start
		
			
	
		try {

			JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Project_Umji/momsmap/JSON/교실면적/"+gu[k]+"교면.json"));
			//JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Project_Umji/momsmap/JSON/교실면적/JG교면.json"));

			// JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo"));
			// Object로 불러올 때
			JSONArray bodyArray = (JSONArray) obj.get("kinderInfo"); // JsonArray로 불러 올 때
			System.out.println(bodyArray.size());
			for (int i = 0; i < bodyArray.size(); i++) {
				code = count();
				for (int j = 0; j < practiceAttribute.length; j++) {

					
					
					vo.setClassId(gu[k] + code);
					//vo.setClassId("JG" + code);
					// 여기서 ? 
					
					JSONObject row = (JSONObject) bodyArray.get(i);
					vo.setKey((String) row.get(practiceAttribute[0]));
					vo.setCrcnt((String) row.get(practiceAttribute[1]));
					vo.setClsrarea((String) row.get(practiceAttribute[2]));
					vo.setPhgrindrarea((String) row.get(practiceAttribute[3]));
					vo.setHlsparea((String) row.get(practiceAttribute[4]));
					vo.setKtchmssparea((String) row.get(practiceAttribute[5]));
					vo.setOtsparea((String) row.get(practiceAttribute[6]));
					
				
				}

				//DBresult = dao.insertCLASSAREA(vo);
			}
			if (DBresult == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		num = 1;
		}//gu end
		
		
	}
	}
