package com.github.catvod.spider.merge.f0;

import android.app.Activity;
import android.view.View;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* renamed from: com.github.catvod.spider.merge.f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0299b implements View.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f786short = {32621, 30803, 29083, 30621, 28835, 31083};
    public final /* synthetic */ int a;

    public /* synthetic */ ViewOnClickListenerC0299b(Activity activity, int i) {
        this.a = i;
    }

    /* renamed from: ۣ۟ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8280() {
        if (C0027.m5017() > 0) {
            return f786short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0049.m8059(this)) {
            case 0:
                try {
                    if (C0007.m1815(C0057.m8988(), C0026.m4951(m8280(), 3, 3, 2851))) {
                        C0004.m1578(C0036.m6174(), C0002.m1316(C0035.m6110()));
                        return;
                    } else {
                        C0038.m6417(C0035.m6110());
                        return;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                try {
                    if (C0007.m1815(C0057.m8988(), C0013.m3106(m8280(), 0, 3, 979))) {
                        C0004.m1578(C0036.m6174(), C0002.m1316(C0035.m6110()));
                        return;
                    } else {
                        C0038.m6417(C0035.m6110());
                        return;
                    }
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
        }
    }
}