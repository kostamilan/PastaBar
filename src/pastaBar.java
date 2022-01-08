
public class pastaBar {

	public static void main(String[] args) {
		String [] stalneMusterije = {"0631111111", "063222222", "063333333", "064444444", "065555555", "066666666"};
		String [] sastojci = {"Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina",
							"Piletina", "4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos",
							"Napolitana", "Povrce mix", "Pecurke", "Kutija"};
		int [] cena = {50, 60 , 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20};
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
