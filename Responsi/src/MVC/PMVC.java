package MVC;

//perintah utk menjalankan MVC, dlm hal ini MVC ada banyak macam cara.. ini salah satunya
public class PMVC {
    PView mhsview = new PView();
    PModel mhsmodel = new PModel();
    PDAO mhsDAO = new PDAO();
    PController mhscontroller = new PController(mhsmodel, mhsview, mhsDAO);
}

