/*
 * Copyright (C) 2016 yydcdut (yuyidong2015@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.yydcdut.rxmarkdown.live;

import android.support.annotation.Nullable;

import com.yydcdut.rxmarkdown.RxMDConfiguration;
import com.yydcdut.rxmarkdown.syntax.Syntax;

/**
 * abstract class to set RxMDConfiguration
 * <p>
 * Created by yuyidong on 16/7/21.
 */
abstract class EditLive implements IEditLive {

    protected RxMDConfiguration mRxMDConfiguration;
    protected boolean shouldFormat = false;
    protected Syntax mSyntax;
    protected Syntax mSyntax1;

    @Override
    public void setRxMDConfiguration(@Nullable RxMDConfiguration rxMDConfiguration) {
        mRxMDConfiguration = rxMDConfiguration;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int before, int after) {
        shouldFormat = false;
    }

    @Override
    public void onSelectionChanged(int selStart, int selEnd) {
    }
}
