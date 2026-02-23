package com.github.catvod.spider.merge.e0;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import com.github.catvod.spider.merge.F0.S;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.e0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0289h implements View.OnKeyListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f782short = {595, 620, 609, 608, 618, 31220, 32458, 30466, -28828, -2512, -32035, 27171, -29962, 23167, -25596, 22617, -25401};
    public final /* synthetic */ S a;

    public ViewOnKeyListenerC0289h(S s) {
        this.a = s;
    }

    /* renamed from: ۥۦۣۢ, reason: contains not printable characters */
    public static short[] m8174() {
        if (C0059.m9257() <= 0) {
            return f782short;
        }
        return null;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (C0006.m1722(keyEvent) == 0) {
            if (i == 4) {
                if (!C0015.m3448(C0035.m6110())) {
                    C0038.m6402(C0002.m1305(m8174(), 8, 9, 2346));
                }
                return !C0015.m3448(C0035.m6110());
            }
            if (i == 82) {
                try {
                    Activity activityM4453 = C0022.m4453();
                    if (activityM4453 != null && C0058.m9127(C0013.m3085(C0047.m7777(activityM4453)), C0004.m1549(m8174(), 0, 5, 517))) {
                        C0047.m7777(C0024.m4726(this));
                        if (C0007.m1815(C0057.m8988(), C0034.m6001(m8174(), 5, 3, 1354))) {
                            C0004.m1578(C0036.m6174(), C0002.m1316(C0035.m6110()));
                        } else {
                            C0038.m6417(C0035.m6110());
                        }
                        return true;
                    }
                } catch (Exception unused) {
                }
                return false;
            }
        }
        View.OnKeyListener onKeyListener = (View.OnKeyListener) C0065.m9715(C0045.m7599(C0024.m4726(this)), view);
        if (onKeyListener != null) {
            return C0022.m4499(onKeyListener, view, i, keyEvent);
        }
        return false;
    }
}