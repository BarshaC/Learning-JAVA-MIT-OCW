public class Marathon {
  int[] times;
  String[] names;

  public Marathon(int[] listOfTimes, String[] listOfNames){
    times = listOfTimes;
    names = listOfNames;
  }

  public int calculateGreatest(){
    int index = 0;
    int greatest = times[0];
    for (int i = 0; i < times.length; i++){
      if (times[i] < greatest){
        greatest = times[i];
        index = i;
      }
    }
    return index;
  }

  public static void main (String[] arguments){
    String[] nameList ={"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex","Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda","Aaron", "Kate"};
    int[] timeList ={341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
    343, 317, 265};
    //for (int i = 0; i < nameList.length; i++) {
      //System.out.println(nameList[i]+ ": " + timeList[i]);}
    Marathon result = new Marathon(timeList, nameList);
    int fastestIndex = result.calculateGreatest();
    System.out.println(fastestIndex);
    System.out.println("The first fastest runner is " + nameList[fastestIndex]);
  }
}
