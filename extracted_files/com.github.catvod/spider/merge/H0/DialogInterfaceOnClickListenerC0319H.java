package com.github.catvod.spider.merge.h0;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Switch;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.h0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0319H implements DialogInterface.OnClickListener {
    public final /* synthetic */ com.github.catvod.spider.merge.a0.S a;
    public final /* synthetic */ Switch b;
    public final /* synthetic */ Switch c;
    public final /* synthetic */ Switch d;
    public final /* synthetic */ Switch e;
    public final /* synthetic */ EditText f;

    public /* synthetic */ DialogInterfaceOnClickListenerC0319H(com.github.catvod.spider.merge.a0.S s, Switch r53, Switch r54, Switch r55, Switch r56, EditText editText) {
        this.a = s;
        this.b = r53;
        this.c = r54;
        this.d = r55;
        this.e = r56;
        this.f = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.github.catvod.spider.merge.a0.S sM4661 = C0024.m4661(this);
        C0047.m7777(sM4661);
        boolean zM5606 = C0031.m5606(C0024.m4676(this));
        boolean zM56062 = C0031.m5606(C0059.m9198(this));
        boolean zM56063 = C0031.m5606(C0055.m8813(this));
        boolean zM56064 = C0031.m5606(C0045.m7620(this));
        String strM6312 = C0037.m6312(C0065.m9797(C0025.m4850(this)));
        C0015.m3438(sM4661);
        C0025.m4829(new RunnableC0317F(zM5606, zM56062, zM56063, zM56064, strM6312));
    }
}