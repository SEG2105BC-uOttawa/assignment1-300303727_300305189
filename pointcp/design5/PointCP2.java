// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

package design5;

public class PointCP2 extends PointCP5
{
  //Constructor ******************************************************

  /**
   * Constructs a polar coordinate object, with a type identifier.
   */
  public PointCP2(double rho, double theta) {
    super('P', rho, theta);
  }
  
  //Instance methods **************************************************
 
  public double getX()
  {
    return (Math.cos(Math.toRadians(getTheta())) * getRho());
  }
  
  public double getY()
  {

    return (Math.sin(Math.toRadians(getTheta())) * getRho());
  }
  
  public double getRho()
  {
    return xOrRho;
  }
  
  public double getTheta()
  {
    return yOrTheta;
  }

  public void convertStorageToPolar(){
    return;
  }
  
  public PointCP3 convertStorageToCartesian(){
    return new PointCP3(getX(), getY());
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();

    double newX = (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y);
    double newY = (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y);
    double rho = Math.sqrt(Math.pow(newX, 2) + Math.pow(newY, 2));
    double theta = Math.toDegrees(Math.atan2(newY, newX));
    return new PointCP2(rho, theta);
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as Polar [" + getRho() + "," + getTheta() + "]";
  }
}
