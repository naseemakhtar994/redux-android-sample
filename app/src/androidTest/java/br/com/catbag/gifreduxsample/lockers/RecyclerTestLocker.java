package br.com.catbag.gifreduxsample.lockers;

import android.support.v7.widget.RecyclerView;

/**
 Copyright 26/10/2016
 Felipe Piñeiro (fpbitencourt@gmail.com),
 Nilton Vasques (nilton.vasques@gmail.com) and
 Raul Abreu (raulccabreu@gmail.com)

 Be free to ask for help, email us!

 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 in compliance with the License. You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software distributed under the License
 is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 implied. See the License for the specific language governing permissions and limitations under
 the License.
 **/

public class RecyclerTestLocker extends BaseTestLocker {

    private RecyclerView mRecycler;
    private int mExpectedItemsCount;

    public RecyclerTestLocker(RecyclerView recycler, int expectedItemsCount) {
        mRecycler = recycler;
        mExpectedItemsCount = expectedItemsCount;
    }

    @Override
    protected boolean isIdle() {
        return mRecycler.getAdapter().getItemCount() == mExpectedItemsCount;
    }
}