interfaces {
    ethernet eth0 {
        address "172.20.20.11/24"
        address "3fff:172:20:20::4/64"
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
        certificate "MIIDyjCCArKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEmxhYi12eW9zLXBjIGxhYiBDQTAeFw0yNjAzMTAyMTU3MTRaFw0yNzAzMTAyMjU3MTRaMFYxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRowGAYDVQQDExFQMS5sYWItdnlvcy1wYy5pbzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAMCw2bnkeBjDNktWCwnIFL/iglISOrCWGGjBis25cs7Gnfr/tkoxgHK6/xIi7O/jem1gDOjX7XdOqN5PLhYoCoge7BzZ/aiXm2us/hEVlKKjOPFirzHSjH0fvC6hZrZCKbY6h5E7i1twFPdAy2jhD6lKjTN5gmP+fMauKdYTetW7Yw816K+it1hUYDjLpXSHDwi3+S25mMyiIRb53FEC/zikumxG9+7XWUXCcOxBgRCuUO6KMHgZtjxN77bCRIZRWH0c3eW2AVe/K6+9Ja162rcRQOUP9KlP6cw684aWpBzON5H+CUYLpikFtsgDnHh+TZOX0ADUWCu2TCZ6vK+LjWsCAwEAAaOBoDCBnTAOBgNVHQ8BAf8EBAMCBaAwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMBMA4GA1UdDgQHBAUBAgMEBjAfBgNVHSMEGDAWgBTFPlhzTnhIGSbr4kXlrMS1VA2/UDA7BgNVHREENDAyggJQMYITY2xhYi1sYWItdnlvcy1wYy1QMYIRUDEubGFiLXZ5b3MtcGMuaW+HBKwUFAswDQYJKoZIhvcNAQELBQADggEBAGtC+jPvy/Mv262tGmVeoW3gdbLn/LTd+6lI8grXb6aF0T+24fpuhPvJ63nsW5XDMyyCN5gT6GqiWrc7sHAxlixBXU3K9mc46226UDGxHkrTrplXZCB1M45LyshgJkTxZzvK6DFme8HhBFvBQyl1SBd0S709t+3TsTdG41CMWi5qFdiVJkrN/2LVcRMzJY20fzksqyJqWYGitaZzEdpiXdEzhdDTiTdCVmGxIhZ20nx9uWBXsDwl6/pC9cLJVHHXdRuz6Gpk72/Z4a79KbB8dCNsqnwMJVZJH74XZSuYzXYDGZ+ZdoxnLPQmZwOjG+KBHun7XO4J34YQiqBKi2Amadw="
        private {
            key "MIIEuwIBADANBgkqhkiG9w0BAQEFAASCBKUwggShAgEAAoIBAQDAsNm55HgYwzZLVgsJyBS/4oJSEjqwlhhowYrNuXLOxp36/7ZKMYByuv8SIuzv43ptYAzo1+13TqjeTy4WKAqIHuwc2f2ol5trrP4RFZSiozjxYq8x0ox9H7wuoWa2Qim2OoeRO4tbcBT3QMto4Q+pSo0zeYJj/nzGrinWE3rVu2MPNeivordYVGA4y6V0hw8It/ktuZjMoiEW+dxRAv84pLpsRvfu11lFwnDsQYEQrlDuijB4GbY8Te+2wkSGUVh9HN3ltgFXvyuvvSWtetq3EUDlD/SpT+nMOvOGlqQczjeR/glGC6YpBbbIA5x4fk2Tl9AA1Fgrtkwmeryvi41rAgMBAAECgf8klsWksXZVdko8kihNiIX2W4x/7KDjA51JnFo/C5RBWgPeesxpn4rvIcvbs/70cdn4I8T6cc0lr9hEl1Ko/tUBIGxDgATVRbug/bhdMMoWwpJUmQUAuAiDgQMsgkB+sJ/JQalDhxk2UedwYSR3t5oXC1gZ7iNwvPBmV+TSs251CoSL6d4r4zGr+XSluOfEXEd9uf3lxKr+h0o06p5sXZqLn2XTr0x+YBrHVg2GkNH0+G9xC+9k8Gs179e0GtYv1D6BdHqj2i4lLIW/4X83355Zmtdzh7huJ/shsjyDEImXb6xfNVRLEjMIIvArlA+cX/N4NTq/HF6r9X2U6dJnuyECgYEA10p39Ph4x9Gyk1mai9p4oniCoqx9s7RBQFuiIijfg25LTm+k3lWRFQZdk3RvUoIvNqhrrvqAcMschjTyGmt+rSKPIbfsURfTLLlnzQVRbbchQHZeX19fhPwGr/dJ/1XwfnIH/I87KFu8g+5QY+l40/N3VHUQqMF/A10LQgvgzOECgYEA5SBi0/Z6OTwET5hUhCdub697pSNpe9mch23lFIcDc3tVVSOyHVcdFOrcPnOvl8Niabs+Kuh22r4FidQCkU8ytB+TX8+XJGnxQcdyLuHlPQLbY+dSw25IVwJ4iwVgRzWYvoYbUSrnpMHc0Bn6j6BUJLi+TPlxJw0zy+/5ybYc98sCgYBC08vOj742EGKFGKA/Xy5pCE1Mn4xZVs+WYZs/TT6sNnVLwJ4FobvqMdKkLdVMYDq1lavvYbSyzmlpQ1APYWSt63dQeR3ywhl73YVZ/5eaHelFcDi1FA67YdvVjUY76vo+1bii7fbn/SnULgpoKRWnfQCCh+AG8iEx8xTGiJdcIQKBgQCTPIaFcwQDt3+FrnvRGI2tE3U/H0xvm90sYgAter1K/lxNg8y3cf1sLaguMaUKvzGEhCBk7lFCK43fje/AdMY+XXQUw496hOHVxVaordzjoexdfI8AquOtlhbkLyY5XEW1WPRA6nNEupcs2yTaGss3dchEKp7920wHp0Q6zN48lQKBgDtbx50Dk1zPGxdX/Xeq8krGIyVE11+YIRLQ3UEqndzQAmmF8ReS/tmRjsvVxMrMDFjSD2n6DiqVccMuB9mnmNp1mcQYlQXCAMn7JanjiK7dnWOJM6RrMlliN+yhGzyakbe5A2/qm2y+73UW9OKgfB1E2Q/zy87gBccS8tnwCEa5"
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
    host-name "P1"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$V0J2JrsH8YgefuLu$3ylYCPo6quAUhQYRtV.7NM0WzUTXQkkwRJzcU6sXCNMpV9eStUX5BVkxGg3eOZxzlINkfYH3I3/oYKFsYeGsB/"
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
