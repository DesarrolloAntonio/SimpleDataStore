## SimpleDataStore
This is an example of a simple project that shows the use of the DataStore API, in this project the old SharedPreferences are not imported. 

The user interface consists of a Checkbox, a Seekbar, and two labels that show the value of the views.

To bind the UI components, the project use DataBinding to assign the true/false value of the CheckBox and the integer value of the Seekbar directly in the XML layout file. To use a LiveData object with your binding class, you need to specify a lifecycle owner to define the scope of the LiveData object.
https://developer.android.com/topic/libraries/data-binding

The example uses ViewBinding to replace findViewById or the Kotlin synthetics
https://developer.android.com/topic/libraries/view-binding

## Architecture
MVVM - The ViewModel returns LiveData objects that can observe in the MainActivity, in this case don't observe values because the use of DataBinding.

## Dependency injection 
Hilt - Inject PreferencesRepository in the constructor of MainActivityViewModel.

## Project
* `AppModule.kt` - Configure the repository with Hilt.
* `DataStoreExtension.kt` - An extension for DataStore that simplify the getters and setters.
* `PreferencesKeys.kt` - A container for perefences keys.
* `PreferencesRepository.kt` - An interface for the repository
* `PreferencesRepositoryImpl.kt` - PreferencesRepository implementation that abstracts the call to the DataStore
* `MainActivity.kt` - The main activity of the example
* `MainViewModel.kt` - ViewModel of the MainActivity, prepare and manage the data for a UI component
* `App.kt` - An application class to init Hilt

## Developed By

Antonio Corrales desarrollogit@gmail.com

## License

Copyright 2021 Antonio Corrales

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

