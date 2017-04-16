
class Solution {
  static int index=0;
  static Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
  
  static String[] friendlyWords(String[] input){
    for(String word : input){
      for(int i=0;i<word.length();i++){
        index+=Character.getNumericValue(word.charAt(i));
        // System.out.println(word+"="+index);
      }
      List<String> l = map.get(index);
      if(l==null)
        map.put(index, l=new ArrayList<String>());
      l.add(word);
      index=0;
    }
      System.out.println(map);
      return new String[]{};
      
  }
  
  
  public static void main(String[] args) {

    String[] temp = new String[]{"amen","mane","mean","name","cheating","dale","deal","lead","listen","silent","teaching"};
    
    System.out.println(Character.getNumericValue('c'));
    friendlyWords(temp);
    System.out.println(map);
    
    for (Map.Entry<Integer, List<String>> entry : map.entrySet()){
      
      String result ="";
      for (String value : entry.getValue()) {
        result+=value+" ";
        
      }
      result=result.trim();
      
      System.out.println(result);
      
    } 
  }
}