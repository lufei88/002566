package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.b0.j;
import com.github.catvod.spider.merge.b0.k;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class JSDemo extends Spider {
    public ExecutorService a;
    public QuickJSContext b;

    public void destroy() {
        C0065.m9706(C0062.m9404(this), new k(this, 0));
    }

    public String homeContent(boolean z) {
        return (String) C0002.m1288(C0049.m8042(C0062.m9404(this), new j(this)));
    }

    public void init(Context context, String str) {
        ExecutorService executorServiceM5003 = C0027.m5003();
        this.a = executorServiceM5003;
        C0065.m9706(executorServiceM5003, new k(this, 1));
    }
}