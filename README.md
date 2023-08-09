# KinanCity - CaptchaAI Fork

There's CapSolver (previously known as captchaai.org) and captchaai.com. Kinan supports CapSolver, but not CaptchaAi, 
which is the cheapest Captcha solver I'm aware of.

When I originally set up Kinan, I compared my options and bought a captchaai.com license, thinking it's supported. 
Turned out only captchaai.org was supported, not captchaai.com. So I quickly hacked together this mod to save me my 15€. 
I later talked to Kinan's maintainer, who didn't see the need to implement it properly. 
Since then, this mod has risen in popularity, so I decided to make the fork public. 

I've run this for a month, and it went smoothly most of the time. But sometimes it'll crash. It's really just hacked 
together.

Please do not create big PRs on this. If you have the time, please make a proper implementation for original Kinan.

# Setup

captchaai functionality is injected into the 2captcha module. So your config just has to look like this:

```properties
captcha.provider=2captcha
captcha.key=dfe2cfca16364a4986b88cb345b1ecbb
captchaMaxParallelChallenges=5
```
`captchaMaxParallelChallenges` should be set automatically, but it doesn't hurt to put in your thread count.
