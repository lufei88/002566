package com.github.catvod.spider.merge.a0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0033;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0233B b;

    public /* synthetic */ x(C0233B c0233b, int i) {
        this.a = i;
        this.b = c0233b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0042.m7168(this)) {
            case 0:
                C0233B c0233bM4703 = C0024.m4703(this);
                C0033.m5827(c0233bM4703);
                C0025.m4829(new RunnableC0261w(c0233bM4703, 2));
                break;
            default:
                C0024.m4703(this).p = true;
                break;
        }
    }
}