package joel.joel_fx_project;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MainController {

    // TableView UI component to display data entries
    @FXML
    private TableView<?> tableView;

    // TextField for entering last name
    @FXML
    private TextField lastNameField;

    // TextField for entering department
    @FXML
    private TextField departmentField;

    // TextField for entering major
    @FXML
    private TextField majorField;

    // TextField for entering email
    @FXML
    private TextField emailField;

    // TextField for entering image URL
    @FXML
    private TextField imageURLField;

    // ImageView for displaying user's image
    @FXML
    private ImageView userImage;

    @FXML
    private void clearFields() {
        lastNameField.clear();
        departmentField.clear();
        majorField.clear();
        emailField.clear();
        imageURLField.clear();
    }
    // Implementation needed for all methods

    // Method to handle adding a new entry
    @FXML
    private void addEntry() {}

    // Method to handle deleting an entry
    @FXML
    private void deleteEntry() {}

    // Method to handle editing an existing entry
    @FXML
    private void editEntry() {}
}
