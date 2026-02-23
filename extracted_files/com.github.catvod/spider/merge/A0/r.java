package com.github.catvod.spider.merge.a0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0259u b;

    public /* synthetic */ r(C0259u c0259u, int i) {
        this.a = i;
        this.b = c0259u;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0002.m1333(this)) {
            case 0:
                C0259u c0259uM3715 = C0017.m3715(this);
                C0001.m1197(c0259uM3715);
                C0025.m4829(new RunnableC0256q(c0259uM3715, 2));
                break;
            default:
                C0017.m3715(this).g = true;
                break;
        }
    }
}