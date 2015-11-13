package pk.team.ui;


import static pk.team.ui.RentalMenuConstans.*;

public class RentalMenu {

    public static final String STAR_UNDERLINE = "\n********\t*\t********\t*\t********";
    public static final String LINE_UNDERLINE = "----------------------------------------------";

    private void showHeaderMenu() {
        System.out.println(STAR_UNDERLINE + "\n********\t\t" + RENTAL_TITLE + "\t\t********");
    }

    private void showFooterMenu() {
        System.out.println(LINE_UNDERLINE + "\nPlease select a number for enter specific option...");
    }

    public void showMenu() {
        showHeaderMenu();
        System.out.println("\t\nMenu:");
        int i = 1;


        for (MenuOption menuOption : MenuOption.values()) {
            System.out.println("\t" + i++ + ". " + menuOption.getMenuName() + "\t\t (" + menuOption.getDescription() + ")");
        }


        showFooterMenu();
    }

    private enum MenuOption {
        LOGIN("Login") {
            public String getDescription() {
                return LOGIN_DESC;
            }
        },
        REGISTER("Register") {
            public String getDescription() {
                return REGISTER_DESC;
            }
        },
        DISPLAY_O("Display offer") {
            public String getDescription() {
                return DISPLAY_DESC;
            }
        },
        QUIT("Quit") {
            public String getDescription() {
                return QUIT_DESC;
            }
        };
        private String menuName;

        MenuOption(String menuName) {
            this.menuName = menuName;
        }

        public String getMenuName() {
            return menuName;
        }

        public String getDescription() {
            return DEFAULT_MENU_OPTION_DESC;
        }

        ;

    }

}
