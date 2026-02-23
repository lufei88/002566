package com.github.catvod.spider.merge.h0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.h0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0318G implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.github.catvod.spider.merge.a0.S b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0318G(com.github.catvod.spider.merge.a0.S s, int i) {
        this.a = i;
        this.b = s;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0009.m2100(this)) {
            case 0:
                com.github.catvod.spider.merge.a0.S sM5125 = C0028.m5125(this);
                C0015.m3438(sM5125);
                C0051.m8252(sM5125);
                break;
            default:
                com.github.catvod.spider.merge.a0.S sM51252 = C0028.m5125(this);
                C0015.m3438(sM51252);
                C0025.m4829(new RunnableC0316E(sM51252, 0));
                break;
        }
    }
}