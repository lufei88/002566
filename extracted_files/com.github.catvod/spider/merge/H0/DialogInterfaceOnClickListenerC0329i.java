package com.github.catvod.spider.merge.h0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0329i implements DialogInterface.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f816short = {3139, 3157, 3153, 3138, 3155, 3160};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0335o b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0329i(C0335o c0335o, int i) {
        this.a = i;
        this.b = c0335o;
    }

    /* renamed from: ۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8668() {
        if (C0010.m2320() < 0) {
            return f816short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0064.m9689(this)) {
            case 0:
                C0335o c0335oM2078 = C0009.m2078(this);
                C0047.m7777(c0335oM2078);
                C0016.m3575(new RunnableC0328h(c0335oM2078, 3));
                C0036.m6174().b = C0010.m2300(m8668(), 0, 6, 3120);
                C0340u c0340uM5392 = C0030.m5392();
                C0047.m7777(c0340uM5392);
                C0016.m3575(new RunnableC0337q(c0340uM5392, 0));
                break;
            default:
                C0335o c0335oM20782 = C0009.m2078(this);
                C0047.m7777(c0335oM20782);
                C0016.m3575(new RunnableC0328h(c0335oM20782, 3));
                break;
        }
    }
}