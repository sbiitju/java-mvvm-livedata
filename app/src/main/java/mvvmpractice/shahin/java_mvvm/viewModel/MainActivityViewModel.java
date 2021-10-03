package mvvmpractice.shahin.java_mvvm.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {
    public MutableLiveData<String> myRandomNumber;

    public MutableLiveData<String> getMyRandomNumber(){
        if (myRandomNumber==null){
            myRandomNumber=new MutableLiveData<>();
            createRandomNumber();
        }
        return myRandomNumber;
    }
    public void createRandomNumber(){
        Random random=new Random();
        myRandomNumber.postValue("My RandomNumber: "+random.nextInt(100-0));
    }

}
