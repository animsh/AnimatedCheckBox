<h1 align="center">AnimatedCheckBox<h1>
</br>

![](/preview/preview.gif?raw=true)


Android custom checkbox based on __[SmoothCheckBox](https://github.com/andyxialm/SmoothCheckBox)__

## Including in your project
### Gradle 
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
	        implementation 'com.github.animsh:AnimatedCheckBox:Tag'
	}
```

## Sample Usage

```xml
 // for xml
 <com.animsh.animatedcheckbox.AnimatedCheckBox
                android:id="@+id/animatedCheckBox1"
                android:layout_width="20dp"
                android:layout_height="20dp"
                android:layout_gravity="center"
                android:layout_margin="4dp"
                android:text=""
                app:border_stroke_width="2dp"
                app:color_checked="@color/purple_700"
                app:color_tick="@color/white"
                app:color_unchecked="@color/white"
                app:color_unchecked_stroke="@color/black"
                app:small_tick="true"
                app:tick_stroke_width="1dp" />

```

```java
//to set checked
setChecked(boolean checked); //by default, it's wthout animation
setChecked(boolean checked, boolean animate);  //pass true to animate
```

```java
//to access animatedcheckbox
 AnimatedCheckBox animatedCheckBox1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        animatedCheckBox1 = findViewById(R.id.animatedCheckBox1);
        animatedCheckBox1.setOnCheckedChangeListener(new AnimatedCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(AnimatedCheckBox checkBox, boolean isChecked) {
                Log.d(TAG, "onCheckedChanged: " + String.valueOf(isChecked));
            }
        });
    }
```

## AnimatedCheckBox Attributes
|Attr|Type|Description|
|---|:---|:---:|
|duration|integer|Animation Duration|
|border_stroke_width|dimension|The border width when unchecked|
|check_stroke_width|dimension|The tick width|
|color_tick|color|Tick color (visible only when checked)|
|color_checked|color|Fill color when selected|
|color_unchecked|color|Fill color when unchecked|
|color_unchecked_stroke|color|Border color when unchecked|


## Find this library useful? :heart:
Support it by joining __[stargazers](https://github.com/animsh/AnimatedCheckBox/stargazers)__ for this repository. :star:

# License
```xml
Copyright 2021 animsh (Sagar More)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
