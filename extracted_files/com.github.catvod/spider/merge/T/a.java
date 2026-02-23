package com.github.catvod.spider.merge.T;

import android.view.View;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ a(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    /* renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m5300(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((MainActivity) obj).a;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0015.m3497(this)) {
            case 0:
                MainActivity mainActivityM8311 = C0052.m8311(this);
                C0058.m9122(m5300(mainActivityM8311), new b(mainActivityM8311, 6));
                break;
            case 1:
                MainActivity mainActivityM83112 = C0052.m8311(this);
                C0058.m9122(m5300(mainActivityM83112), new b(mainActivityM83112, 5));
                break;
            case 2:
                MainActivity mainActivityM83113 = C0052.m8311(this);
                C0058.m9122(m5300(mainActivityM83113), new b(mainActivityM83113, 1));
                break;
            case 3:
                MainActivity mainActivityM83114 = C0052.m8311(this);
                C0058.m9122(m5300(mainActivityM83114), new b(mainActivityM83114, 0));
                break;
            case 4:
                MainActivity mainActivityM83115 = C0052.m8311(this);
                C0058.m9122(m5300(mainActivityM83115), new b(mainActivityM83115, 4));
                break;
            default:
                MainActivity mainActivityM83116 = C0052.m8311(this);
                C0058.m9122(m5300(mainActivityM83116), new b(mainActivityM83116, 2));
                break;
        }
    }
}