# Z2 Form

[![Maven Central](https://img.shields.io/maven-central/v/hu.simplexion.z2/z2-form)](https://mvnrepository.com/artifact/hu.simplexion.z2/z2-form)
[![GitHub License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)
![Kotlin](https://img.shields.io/github/languages/top/spxbhuhb/z2-form)

Web form with schema and Material 3. Part of [Z2](https://github.com/spxbhuhb/z2).

Status: **experimental**

## Usage

```kotlin
fun Z2.login() =
    form(LoginSchema) { ctx, schema ->
        
        field(ctx) { schema.account }
        field(ctx) { schema.password }
        
        textButton(strings.login) { ctx.submit() }
        
        ctx.submit = { login(ctx[schema.account], ctx[schema.password]) }
    }
```

## License

> Copyright (c) 2023 Simplexion Kft, Hungary and contributors
>
> Licensed under the Apache License, Version 2.0 (the "License");
> you may not use this work except in compliance with the License.
> You may obtain a copy of the License at
>
>    http://www.apache.org/licenses/LICENSE-2.0
>
> Unless required by applicable law or agreed to in writing, software
> distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
> See the License for the specific language governing permissions and
> limitations under the License.