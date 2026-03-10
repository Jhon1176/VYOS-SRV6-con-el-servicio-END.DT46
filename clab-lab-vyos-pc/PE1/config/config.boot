interfaces {
    ethernet eth0 {
        address "172.20.20.12/24"
        address "3fff:172:20:20::7/64"
        description "Management Interface"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEmxhYi12eW9zLXBjIGxhYiBDQTAeFw0yNjAzMTAyMTU3MTRaFw0yNzAzMTAyMjU3MTRaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJsYWItdnlvcy1wYyBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCm6EPsI2J8ApuuS94MZWjn0G7hfMRKmzOiNf65mME+F/jtKZZ0FtcQiIB3XK00Zgps2rzddM8qkHtVDiS71vrKKgvb3V2EnobxeMIzxKa9V+R5pkG+f3kTbFlw7Tf/0YJvcvx2joYyiwc7HruMOGOslnxaIjxBPVlW99ol6mIom3gJPnynL6tcrMu8dkVyGSvucLyIOxLuuzo0y+sgQanAj0pElMm9x4QtYdHY+cLjkhQn+TAo2GECT+W5KMy0LLO3PpZDv5Soa1iUUPuz53d9Sy4j8E8S5hncMBhnHfwr5IM6ws1D94ugaQPaRxo3y2ymiIwJH/Pc3I5pKlZqztQvAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUxT5Yc054SBkm6+JF5azEtVQNv1AwDQYJKoZIhvcNAQELBQADggEBABe+15CQ8mC3wN6+M7z1n/el9O/kF+QHRm2zAlybWVc2oPKxY7V2xBlMYcbjvI2nV0ALkTLrIO9QOBW4ChcO4suuBoUq1UyxiAaGpt0uu9dzxehN6qN+afeZ02Pv5lsmBp03sJvYWwVxrc7FzGC5G+cme405Jck7iKPV7Zry/o98f1SCzQVIAaTpztZMpVD6Us3jfaYhlCJerqvHC8Q4DPxrNwlxZJ3o2arFD+C4WGz4QfqMinIiuyBbPJCydbE9In07HxrhZjBJx3cjTuyvBFXNG23EAtSk1BC3a4V8gjv4HO/ma95r8vmZJNEzmsFSLEmmBmET/fhD0jcWWRI5I7c="
    }
    certificate self {
        certificate "MIIDzjCCAragAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEmxhYi12eW9zLXBjIGxhYiBDQTAeFw0yNjAzMTAyMTU3MjJaFw0yNzAzMTAyMjU3MjJaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJQRTEubGFiLXZ5b3MtcGMuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDGV8fd6HwN81gLw4DiCTIKwOkKwXaSpK6v51+q8DtRJP2oIogOM6suiaHDymOt8c41bf1y72WNYEAz+Xg6oG7mhuHO8p5eQsSI7B/C7pVLe2xFEtfyGOA8e7mYelqJ74Fa8BAaKyv1hCRNboD3BLWkG2gtMhWMExs7G9ONJykaTdwHB9TceTV3tQn4F2nAf/QLxBCgQ9+FMyEEfRKgUYPDWVRNZYsWEVBl+vQsoy8B8d0iPRNaLQ5chpaa4tUT5efpf2Zfa4CKxZWbwgvrOwBkLD6UfHAhXuDZ1Ccv2hV3gP0qLOcGYun5TByfy/cglsF7YzlNKUFT0+ImcaQCR7A1AgMBAAGjgaMwgaAwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUxT5Yc054SBkm6+JF5azEtVQNv1AwPgYDVR0RBDcwNYIDUEUxghRjbGFiLWxhYi12eW9zLXBjLVBFMYISUEUxLmxhYi12eW9zLXBjLmlvhwSsFBQMMA0GCSqGSIb3DQEBCwUAA4IBAQAyrxX5h+xj2tLwofJhB+yd/bsdDcYyU2IACjofkjRrKT26uxzINw0Lzr8FnHPU/Sd/bm6IeJMKHhcFe1iEz/nRRBuhuaoKl6eOgr2ajpTyfG1SowYpD3uPYbYvsrGKpSf/taf6uqRQT8mUr6YD6kN0jTb8pS2cBI9xtQb01GDxpsFtJSYDQyWz3LEC9DB2KpPY1Pw21ioXTA3zEvl1/d5NnqGwE9u3HIWp09LDdx/mYuIatWrcbZCNTgjCv6u4Hr+yRTzqzfD815e22WeUuWwPntaJ2feSh+0HBwUDVDI74AH2/LhjUEEfKT3kZWg/V2eAOZ7iPm5EnKrxpgY7qMwh"
        private {
            key "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDGV8fd6HwN81gLw4DiCTIKwOkKwXaSpK6v51+q8DtRJP2oIogOM6suiaHDymOt8c41bf1y72WNYEAz+Xg6oG7mhuHO8p5eQsSI7B/C7pVLe2xFEtfyGOA8e7mYelqJ74Fa8BAaKyv1hCRNboD3BLWkG2gtMhWMExs7G9ONJykaTdwHB9TceTV3tQn4F2nAf/QLxBCgQ9+FMyEEfRKgUYPDWVRNZYsWEVBl+vQsoy8B8d0iPRNaLQ5chpaa4tUT5efpf2Zfa4CKxZWbwgvrOwBkLD6UfHAhXuDZ1Ccv2hV3gP0qLOcGYun5TByfy/cglsF7YzlNKUFT0+ImcaQCR7A1AgMBAAECggEAEeOi9EHexodXPqBghIKdz9h8bGrsnedaliUBPPKz9uqmMj8DFHzWiLkDLRyZBvxTRABqpq4u86RlxgpPLMKBnis2PKsnW4scHNlnN/a64nb8WfKMJZrWxr3GDJmkhuJiQWh7m1Cfg2Jqv80itqTnGSkbqU/mH58tipRE7WtFyshoMVYoP/UpZykRdFvOIth9UdLagSBm3yYr18/oKEMLv/9fUWLbJu0m4lS2nvFKuWvV84Nr0S8FoHlSH9kDramulAS01Nf9NHft0Noa3UrITx4Fu3eS0hjgE2bvWkw8sig2bZ/fNIsw7YP/jSlBjSQFCjk6+6KrYYfUtOWgclRpNQKBgQD0zsIF2bSWiDjEbfTvm3QidkXvaFJm2i59p84TnLy0emv87yf6YJPTMsaqIWzk+UspaReVMTvADF6LaweXgLwbfgYrxs6+xOgM4UiP0TtwqBGHqySCl/veGOT+Kpg4r9LVAyWI4Tdh8PMwoWSbq63oRNAEJ4SB7MiB3KuV0y0HnwKBgQDPaTJheidDaNEskzfkyWuceTRRHoZeOcNUEFcqqYhsPDBevbq/n0JsdjiJHeHOvsjxgpqsQgaJGvmiPeHuPyDHoCAEyE2sJFESBxd9FJmV+cMbUvYJcSWXSrMwEeDDg4QI+hqw5A8v0x+qEgf1tNozww7YmfGIscln9zZMNFnHqwKBgC9Hcx9QIVllK5l8Ju7TlgVF1FHdUvS8NHheHSWagrNUZWCvC4iGeGY0izu2QuKh5sszmbNdk82OVgAVBp1S5oFkwGpZ9fnP64T5SVtFLHagbupFukJieek145vWvBlOk6hB+FDMNjb7IuyEbvrFmEugZpA21ZeGFF9IL/c6lpq/AoGAQDxbTxcu29C1n7GEiQXcnxxmmIz0nnATT5Cz/lF9H9BQRrdKBBjF0KOYhNbNXWN3Bl0lnB3iukmxcI7rzwacF1c/M1v5ukuRFB1AKAveOTWeOHMsIeZ59u46qrOOwd6UYNdcttYa4fvn/ZsR/gXh4lAR5AFhba1qLBnDJjy8ZXsCgYB+dhnFCUarr2Y1c7tuVg0Wi4kl+eDyK9IYk9+D44kvdKe86oSVcpASdAKY4/fIf27gKvkdIxlRvBEd0rNH0raCPZ1MHrA4lVGSL84dV4aCF5Nt3xEay/3l9Etgw3N/tLJ/RDPV6cRO1KnXYB9zRBVyDkwDxKBccwoFn6El0jj+4w=="
        }
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "PE1"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$.oBX.U3QELiquiWy$VjBDqJvMA.iJh4LK1IhJMbP6tfEJ0NcRMpRugfoVwJT.bgxeZ51I/aaX8AZbbixqEuoMy9PuQfcT81xU/TRgp1"
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@20:flow-accounting@3:https@7:ids@2:interfaces@34:ipoe-server@4:ipsec@14:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:nhrp@1:ntp@3:openconnect@3:openvpn@5:ospf@2:pim@1:policy@9:pppoe-server@11:pptp@5:qos@3:quagga@12:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@3:sstp@6:system@31:vpp@4:vrf@4:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 2026.01.24-0021-rolling
