import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.kotlinio.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.sql.ClientInfoStatus

class CobaViewModel: ViewModel() {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var status : String by mutableStateOf("")
        private set
    var alamat : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm: String, tlp: String, eml: String,jk: String, sts: String, address:String){
        namaUsr=nm;
        noTlp=tlp;
        email=eml;
        jenisKl=jk;
        status=sts;
        alamat=address;
    }
    fun setJK(pilihJK:String){
        _uiState.update { currenState -> currenState.copy(sex= pilihJK)}
    }

    fun setStatusnikah(pilihStatus:String){
        _uiState.update { currenState -> currenState.copy(stat= pilihStatus)}
    }
}