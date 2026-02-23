package com.github.catvod.spider.merge.h0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.h0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0338s implements DialogInterface.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f821short = {2049, 2051, 2078, 2057, 2056, 2126, 2069, 2078, 2124, 2050, 2068, 2064, 2066, 2073, 2069, 2064, 2079, 2076, 2052, 2135, 2070, 2078, 2124, 2072, 2079, 2069, 2068, 2057};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0340u b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0338s(C0340u c0340u, int i) {
        this.a = i;
        this.b = c0340u;
    }

    /* renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static short[] m8673() {
        if (C0034.m6048() <= 0) {
            return f821short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0047.m7842(this)) {
            case 0:
                C0047.m7777(C0047.m7776(this));
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0034.m6023());
                C0018.m3933(sb, C0028.m5109(m8673(), 0, 28, 2161));
                try {
                    C0047.m7790(C0047.m7763(sb));
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                C0340u c0340uM7776 = C0047.m7776(this);
                C0047.m7777(c0340uM7776);
                C0016.m3575(new RunnableC0337q(c0340uM7776, 1));
                break;
        }
    }
}