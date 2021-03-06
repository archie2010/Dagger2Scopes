/*
 * Copyright (C) 2015 Jorge Castillo Pérez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jorgecastilloprz.dagger2scopes.datasources.mock.model;

/**
 * @author Jorge Castillo Pérez
 */
public class MockLucasArtGame extends MockGame {

  public MockLucasArtGame() {
    /* Required by parceler */
  }

  public MockLucasArtGame(String imageUrl, String name, String releaseDate, String description) {
    this.imageUrl = imageUrl;
    this.name = name;
    this.releaseDate = releaseDate;
    this.author = "LucasArts";
    this.description = description;
    this.id = name.hashCode() + hashCode();
    this.mockNotImportantInfo1 = "Not important info 1";
    this.mockNotImportantInfo2 = "Not important info 1";
    this.mockNotImportantInfo3 = "Not important info 1";
    this.mockNotImportantInfo4 = "Not important info 1";
    this.mockNotImportantInfo5 = "Not important info 1";
  }
}
