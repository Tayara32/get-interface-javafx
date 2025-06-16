module com.projeto.getinterfacejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.projeto.getinterfacejavafx to javafx.fxml;
    exports com.projeto.getinterfacejavafx;
}