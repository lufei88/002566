package com.github.catvod.spider.merge.T;

import android.view.View;
import com.github.catvod.debug.testActivity;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.q.C0058;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ testActivity b;

    public /* synthetic */ c(testActivity testactivity, int i) {
        this.a = i;
        this.b = testactivity;
    }

    /* renamed from: ۟ۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m5307(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((testActivity) obj).a;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0040.m6594(this)) {
            case 0:
                testActivity testactivityM7493 = C0044.m7493(this);
                C0058.m9122(m5307(testactivityM7493), new d(testactivityM7493, 0));
                break;
            case 1:
                testActivity testactivityM74932 = C0044.m7493(this);
                C0058.m9122(m5307(testactivityM74932), new d(testactivityM74932, 2));
                break;
            case 2:
                testActivity testactivityM74933 = C0044.m7493(this);
                C0058.m9122(m5307(testactivityM74933), new d(testactivityM74933, 4));
                break;
            case 3:
                testActivity testactivityM74934 = C0044.m7493(this);
                C0058.m9122(m5307(testactivityM74934), new d(testactivityM74934, 2));
                break;
            case 4:
                testActivity testactivityM74935 = C0044.m7493(this);
                C0058.m9122(m5307(testactivityM74935), new d(testactivityM74935, 2));
                break;
            default:
                testActivity testactivityM74936 = C0044.m7493(this);
                C0058.m9122(m5307(testactivityM74936), new d(testactivityM74936, 3));
                break;
        }
    }
}