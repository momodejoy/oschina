package com.tencent.qqmusic;

import android.app.Activity;
import com.robotium.recorder.executor.Executor;

@SuppressWarnings("rawtypes")
public class ShareAccountActivityExecutor extends Executor {

	@SuppressWarnings("unchecked")
	public ShareAccountActivityExecutor() throws Exception {
		super((Class<? extends Activity>) Class.forName("com.tencent.qqmusic.activity.ShareAccountActivity"),  "com.tencent.qqmusic.R.id.", new android.R.id(), false, false, "1481201958809");
	}

	public void setUp() throws Exception { 
		super.setUp();
	}
}
