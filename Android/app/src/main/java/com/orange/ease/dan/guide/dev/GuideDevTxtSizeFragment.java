/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.orange.ease.dan.guide.dev;

import com.orange.ease.dan.R;

import org.androidannotations.annotations.EFragment;

import static com.orange.ease.dan.R.string.dev_description_txtsize;
import static com.orange.ease.dan.R.string.dev_lien_txtsize;
import static com.orange.ease.dan.R.string.dev_title_textsize;


@EFragment(R.layout.guidedev_helps_template)
public class GuideDevTxtSizeFragment extends AGuideDevBaseFragment {

    @Override
    protected int getDescription() {
        return dev_description_txtsize;
    }

    @Override
    protected int getLink() {
        return dev_lien_txtsize;
    }

    @Override
    protected int getTitle() {
        return dev_title_textsize;
    }
}

