// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

package design5;

public class PointCP3 extends PointCP5
{
  //Constructor ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP3(double x, double y) {
    super('C', x, y);
  }
	
  //Instance methods **************************************************
 
  public double getX()
  {
    return xOrRho;
  }
  
  public double getY()
  {
    return yOrTheta;
  }
  
  public double getRho()
  {
    return (Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2)));
  }
  
  public double getTheta()
  {
    return Math.toDegrees(Math.atan2(getY(), getX()));
  }

  public PointCP2 convertStorageToPolar(){
    return new PointCP2(getRho(), getTheta());
  }

  public void convertStorageToCartesian(){
    return;
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
    return "Stored as Cartesian  (" + getX() + "," + getY() + ")";
  }
}
