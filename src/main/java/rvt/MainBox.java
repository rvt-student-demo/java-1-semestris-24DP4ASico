package rvt;

public class MainBox{

  public static void main ( String[] args )
  {
    Box box = new Box( 2.5, 5.0, 6.0 ) ;
    Box big = box.biggerBox(box);
    Box small = box.smallerBox(box);
     //System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );

      System.out.println( "length: " + box.length() + " height: " + box.height() +
                        " width:  " + box.width() )  ;

        //System.out.println( "topArea: "  + box.topArea() );
        //System.out.println( "sideArea: "  + box.sideArea() );
        //System.out.println( "faceArea: "  + box.faceArea() );
        System.out.println("Bigger length: " + big.length()+ " Bigger height:" + big.height()
                            + " Bigger width:" + big.width());
        System.out.println("Smaller length: " + small.length()+ " Smaller height:" + small.height()
                           + " Smaller width:" + small.width());
        System.out.println("Small fits in box? " + small.nests(box));
        System.out.println("Big fits in box? " + big.nests(box));
        System.out.println("Big fits in small? " + small.nests(big));
  }
}
