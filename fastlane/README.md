fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew install fastlane`

# Available Actions
## Android
### android unit_tests
```
fastlane android unit_tests
```
Runs all the unit tests
### android increment_major_version
```
fastlane android increment_major_version
```
Increment major version
### android increment_feature_version
```
fastlane android increment_feature_version
```
Increment feature version
### android increment_fix_version
```
fastlane android increment_fix_version
```
Increment fix version
### android assemble_dev
```
fastlane android assemble_dev
```
Building Develop environment
### android assemble_pro
```
fastlane android assemble_pro
```
Building Production environment
### android dev_firebase_app_distribution
```
fastlane android dev_firebase_app_distribution
```
Uploading developing environment to Firebase App Distribution
### android pro_firebase_app_distribution
```
fastlane android pro_firebase_app_distribution
```
Uploading production environment to Firebase App Distribution
### android commit_changes
```
fastlane android commit_changes
```
Commit Changes

----

This README.md is auto-generated and will be re-generated every time [fastlane](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
