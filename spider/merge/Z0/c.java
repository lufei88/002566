package com.github.catvod.spider.merge.Z0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c {
    public static String a(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (C0012.m2962(it)) {
            C0016.m3605(sb, C0048.m7949(it));
            if (C0012.m2962(it)) {
                C0018.m3933(sb, str);
            }
        }
        return C0047.m7763(sb);
    }
}