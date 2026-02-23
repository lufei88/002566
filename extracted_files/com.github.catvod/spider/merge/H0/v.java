package com.github.catvod.spider.merge.h0;

import android.content.DialogInterface;
import android.view.Window;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (C0029.m5261(this)) {
            case 0:
                x xVar = (x) C0004.m1496(this);
                C0002.m1251(C0017.m3703(C0039.m6522(xVar), -1), new r(1, xVar));
                break;
            default:
                Window windowM1119 = C0000.m1119(C0013.m3145((com.github.catvod.spider.merge.a0.S) C0004.m1496(this)));
                if (windowM1119 != null) {
                    C0052.m8338(windowM1119, C0027.m5058(windowM1119));
                    break;
                }
                break;
        }
    }
}