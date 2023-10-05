// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

package design3;
/**
 * This class contains instances of coordinates in cartesian 
 * format.  It also provides the utilities to convert
 * into the polar format, but will not store these values
 * as this class only stores cartesian coordinates. It is not an 
 * optimal design, it is used only to illustrate some design issues.
 */
public class PointCP3 {
    
  //Instance variables ************************************************
  
  /**
   * Contains the current value of X
   */
  private double x;
  
  /**
   * Contains the current value of Y
   */
  private double y;
	
  //Constructor ******************************************************

  /**
   * Constructs a cartesian coordinate object
   */
  public PointCP3(double x, double y)
  {
    this.x = x;
    this.y = y;
  }
  
  //Instance methods **************************************************
 
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }
  
  public double getRho()
  {
    return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
  }
  
  public double getTheta()
  {
    return Math.toDegrees(Math.atan2(y, x));
  }

  public void convertStorageToPolar()
  {
      System.out.println("Polar  [" + getRho() + ", " + getTheta() + "]");
  }

  public void convertStorageToCartesian(){
    return;
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP3 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP3 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP3(
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return ("Stored as Cartesian  (" + getX() + "," + getY() + ")" + "\n");
  }
}
