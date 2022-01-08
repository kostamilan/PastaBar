
public class pastaBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static int findIngredient(String[] ingredients, String ingredientName) {
		for (int i = 0; i < ingredients.length; i++) {
			if(ingredients[i].equalsIgnoreCase(ingredientName)) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {
		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phoneNumbers[i].equals(phone)) {
				return true;
			}
		}
		return false;
	}

}
