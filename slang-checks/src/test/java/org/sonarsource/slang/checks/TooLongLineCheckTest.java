/*
 * SonarSource SLang
 * Copyright (C) 2018-2025 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Sonar Source-Available License Version 1, as published by SonarSource SA.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Sonar Source-Available License for more details.
 *
 * You should have received a copy of the Sonar Source-Available License
 * along with this program; if not, see https://sonarsource.com/license/ssal/
 */
package org.sonarsource.slang.checks;

import org.junit.jupiter.api.Test;

class TooLongLineCheckTest {

  private TooLongLineCheck check = new TooLongLineCheck();

  @Test
  void max_120() {
    check.maximumLineLength = 120;
    Verifier.verify("TooLongLine_120.slang", check);
  }

  @Test
  void max_40() {
    check.maximumLineLength = 40;
    Verifier.verify("TooLongLine_40.slang", check);
  }
}
