module joel.joel_fx_project {
    // JavaFX controls module for UI components
    requires javafx.controls;

    // JavaFX FXML module for loading FXML files
    requires javafx.fxml;

    // ControlsFX library (used for additional JavaFX UI controls)
    requires org.controlsfx.controls;

    // FormsFX library (used for form handling and validation)
    requires com.dlsc.formsfx;

    // BootstrapFX (provides Bootstrap-styled UI elements for JavaFX)
    requires org.kordamp.bootstrapfx.core;

    // Opens the joel.joel_fx_project package
    opens joel.joel_fx_project to javafx.fxml;

    // Exports the joel.joel_fx_project
    exports joel.joel_fx_project;
}
