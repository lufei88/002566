package com.github.catvod.spider;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.j.j;

/* loaded from: classes.dex */
public final /* synthetic */ class XBPQb implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f123short = {23189, 29822, 29761, -27803, 26207, -32040, 23928};
    public final /* synthetic */ XBPQ c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ XBPQb(XBPQ xbpq, String str, String str2) {
        this.c = xbpq;
        this.d = str;
        this.e = str2;
    }

    /* renamed from: ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m742() {
        if (C0046.m7701() > 0) {
            return f123short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final XBPQ xbpqM9497 = C0063.m9497(this);
        String strM8774 = C0055.m8774(this);
        String strM4822 = C0025.m4822(this);
        C0047.m7785();
        C0047.m7777(xbpqM9497);
        C0027.m5038(C0022.m4403(m742(), 0, 7, 2832), strM8774, strM4822, new j
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002d: INVOKE 
              (wrap:java.lang.String:0x0027: INVOKE 
              (wrap:short[]:0x001a: INVOKE  STATIC call: com.github.catvod.spider.XBPQb.???():short[] A[MD:():short[] (m), WRAPPED])
              (0 int)
              (7 int)
              (2832 int)
             STATIC call: com.github.catvod.spider.merge.K0.????.?????(short[], int, int, int):java.lang.String A[MD:(short[], int, int, int):java.lang.String (m), WRAPPED])
              (r1v0 'strM8774' java.lang.String)
              (r2v0 'strM4822' java.lang.String)
              (wrap:com.github.catvod.spider.merge-xbpq.j.j:0x0017: CONSTRUCTOR (r0v0 'xbpqM9497' com.github.catvod.spider.XBPQ A[DONT_INLINE]) A[MD:(com.github.catvod.spider.XBPQ):void (m), WRAPPED] call: com.github.catvod.spider.XBPQ.2.<init>(com.github.catvod.spider.XBPQ):void type: CONSTRUCTOR)
             STATIC call: com.github.catvod.spider.merge.S.????.????(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void (m)] in method: com.github.catvod.spider.XBPQb.run():void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.github.catvod.spider.XBPQ.2.<init>(com.github.catvod.spider.XBPQ):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:829)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            this = this;
            r4 = r55
            com.github.catvod.spider.XBPQ r0 = com.github.catvod.spider.merge.x0.C0063.m9497(r4)
            java.lang.String r1 = com.github.catvod.spider.merge.i0.C0055.m8774(r4)
            java.lang.String r2 = com.github.catvod.spider.merge.Q0.C0025.m4822(r4)
            java.lang.String r3 = com.github.catvod.spider.merge.d.C0047.m7785()
            com.github.catvod.spider.merge.d.C0047.m7777(r0)
            com.github.catvod.spider.XBPQ$2 r3 = new com.github.catvod.spider.XBPQ$2
            r3.<init>()
            short[] r21 = m742()
            r24 = 2832(0xb10, float:3.968E-42)
            r22 = 0
            r23 = 7
            java.lang.String r21 = com.github.catvod.spider.merge.K0.C0022.m4403(r21, r22, r23, r24)
            r0 = r21
            com.github.catvod.spider.merge.S.C0027.m5038(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQb.run():void");
    }
}