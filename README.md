
# react-native-gemius

## Getting started

`$ npm install react-native-gemius --save`

### Mostly automatic installation

`$ react-native link react-native-gemius`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-gemius` and add `RNReactNativeGemius.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeGemius.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeGemiusPackage;` to the imports at the top of the file
  - Add `new RNReactNativeGemiusPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-gemius'
  	project(':react-native-gemius').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-gemius/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-gemius')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeGemius.sln` in `node_modules/react-native-gemius/windows/RNReactNativeGemius.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Native.Gemius.RNReactNativeGemius;` to the usings at the top of the file
  - Add `new RNReactNativeGemiusPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNReactNativeGemius from 'react-native-gemius';

// TODO: What to do with the module?
RNReactNativeGemius;
```
