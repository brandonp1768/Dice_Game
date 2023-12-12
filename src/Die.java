
public class Die {
    private int numSides;
    private String primaryColor;
    private String secondaryColor;
    private String numColor;
    private int[] sideValues;

    /**
     * @param numSides represents the number of sides the die has
     * @param primaryColor represents the primary color of the die
     * @param secondaryColor represents the secondary color of the die
     * @param numColor represents the color of the numbers on the die
     * @param sideValues represents the values of each side on the die
     */
    Die(int numSides, String primaryColor, String secondaryColor, String numColor, int[] sideValues) {
        this.numSides = numSides;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.numColor = numColor;
        this.sideValues = sideValues;
    }
    // Getters
    /**
     * @return the number of sides of the die
     */
    public int getNumSides() {return this.numSides;}

    /**
     * @return the primary color of the die
     */
    public String getPrimaryColor() {return this.primaryColor;}

    /**
     * @return the secondary color of the die
     */
    public String getSecondaryColor() {return this.secondaryColor;}

    /**
     * @return the color of the numbers on the die
     */
    public String getNumColor() {return this.numColor;}

    /**
     * @return the values of all the sides of the die
     */
    public int[] getSideValues() {return this.sideValues;}
    // Setters

    /**
     * @param numSides represents the number of sides the user wants the die to have
     */
    public void setNumSides(int numSides) {this.numSides = numSides;}

    /**
     * @param primaryColor represents the primary color the user wants the die to be
     */
    public void setPrimaryColor(String primaryColor) {this.primaryColor = primaryColor;}

    /**
     * @param secondaryColor represents the secondary color the user wants the die to be
     */
    public void setSecondaryColor(String secondaryColor) {this.secondaryColor = secondaryColor;}

    /**
     * @param numColor represents the color of the numbers the user wants them to be
     */
    public void setNumColor(String numColor) {this.numColor = numColor;}

    /**
     * @param sideValues represents the value of the sides the user wants the die to have
     */
    public void setSideValues(int[] sideValues) {this.sideValues = sideValues;}
    // Methods

    /**
     * @return "rolls" the die and returns the value that the die lands on
     */
    public int roll() {
        int random_num = (int)(Math.random() * (this.numSides) - 1
        );
        int side_value = this.sideValues[random_num];
        return side_value;
    }
}
