package com.github.catvod.spider.merge.a0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0039;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ M b;

    public /* synthetic */ I(M m, int i) {
        this.a = i;
        this.b = m;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0039.m6537(this)) {
            case 0:
                M mM5198 = C0028.m5198(this);
                C0031.m5581(mM5198);
                C0025.m4829(new RunnableC0239H(mM5198, 2));
                break;
            default:
                C0028.m5198(this).b = true;
                break;
        }
    }
}