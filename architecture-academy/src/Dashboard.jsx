import React, { useState } from "react";

const WEEKS = [
  { week: 1, title: "The Core Internet", topics: ["DNS", "IP", "HTTP", "Vertical vs Horizontal Scaling"] },
  { week: 2, title: "Load Balancing & API Gateways", topics: ["Round Robin", "Consistent Hashing", "API Gateway"] },
  { week: 3, title: "Databases 101", topics: ["SQL vs NoSQL", "Replication", "Read Replicas"] },
  { week: 4, title: "Caching Strategies", topics: ["Redis", "Memcached", "Cache Invalidation"] },
  { week: 5, title: "Database Scaling", topics: ["Sharding", "Partitioning", "Federation"] },
  { week: 6, title: "Async Processing", topics: ["Message Queues", "Pub/Sub", "Kafka"] },
  { week: 7, title: "Advanced Safety", topics: ["Idempotency", "Rate Limiting", "Circuit Breakers"] },
  { week: 8, title: "Capstone Project", topics: ["BookMyShow from Scratch", "Global Scale Design"] },
];

const XP_TO_LEVEL = [
  { level: 1, title: "Intern Architect",   minXP: 0   },
  { level: 2, title: "Junior Architect",   minXP: 50  },
  { level: 3, title: "Mid Architect",      minXP: 120 },
  { level: 4, title: "Senior Architect",   minXP: 220 },
  { level: 5, title: "Staff Architect",    minXP: 350 },
  { level: 6, title: "Principal Architect",minXP: 500 },
  { level: 7, title: "Chief Architect",    minXP: 700 },
];

function getLevelInfo(xp) {
  let current = XP_TO_LEVEL[0];
  let next = XP_TO_LEVEL[1];
  for (let i = 0; i < XP_TO_LEVEL.length; i++) {
    if (xp >= XP_TO_LEVEL[i].minXP) {
      current = XP_TO_LEVEL[i];
      next = XP_TO_LEVEL[i + 1] || null;
    }
  }
  return { current, next };
}

function XPBar({ xp }) {
  const { current, next } = getLevelInfo(xp);
  const progress = next
    ? ((xp - current.minXP) / (next.minXP - current.minXP)) * 100
    : 100;
  return (
    <div style={{ marginBottom: 20 }}>
      <div style={{ display: "flex", justifyContent: "space-between", marginBottom: 6 }}>
        <span style={{ fontWeight: 700, color: "#facc15", fontSize: 16 }}>
          Lvl {current.level} — {current.title}
        </span>
        <span style={{ color: "#94a3b8", fontSize: 13 }}>
          {xp} XP {next ? `/ ${next.minXP} XP` : "(MAX)"}
        </span>
      </div>
      <div style={{ background: "#1e293b", borderRadius: 99, height: 12, overflow: "hidden" }}>
        <div
          style={{
            width: `${progress}%`,
            height: "100%",
            background: "linear-gradient(90deg, #facc15, #f97316)",
            borderRadius: 99,
            transition: "width 0.6s ease",
          }}
        />
      </div>
      {next && (
        <div style={{ color: "#64748b", fontSize: 12, marginTop: 4 }}>
          {next.minXP - xp} XP to {next.title}
        </div>
      )}
    </div>
  );
}

function SystemDiagram({ week }) {
  const nodes = [
    { id: "user",    label: "👤 User",          color: "#6366f1" },
    { id: "server",  label: "🖥️ Single Server",  color: "#0ea5e9" },
    { id: "db",      label: "🗄️ Single Database", color: "#10b981" },
  ];

  return (
    <div style={{ background: "#0f172a", borderRadius: 12, padding: 24, marginTop: 16 }}>
      <div style={{ color: "#94a3b8", fontSize: 12, marginBottom: 16, textTransform: "uppercase", letterSpacing: 1 }}>
        System Architecture — Week {week}
      </div>
      <div style={{ display: "flex", alignItems: "center", justifyContent: "center", gap: 12, flexWrap: "wrap" }}>
        {nodes.map((node, i) => (
          <React.Fragment key={node.id}>
            <div
              style={{
                background: node.color + "22",
                border: `2px solid ${node.color}`,
                borderRadius: 10,
                padding: "12px 20px",
                color: "#f1f5f9",
                fontWeight: 600,
                fontSize: 14,
                textAlign: "center",
                minWidth: 130,
              }}
            >
              {node.label}
            </div>
            {i < nodes.length - 1 && (
              <div style={{ color: "#475569", fontSize: 22, fontWeight: 300 }}>→</div>
            )}
          </React.Fragment>
        ))}
      </div>
      <div style={{ color: "#475569", fontSize: 11, textAlign: "center", marginTop: 14 }}>
        Architecture evolves each week as we add components
      </div>
    </div>
  );
}

function WeekCard({ data, currentWeek }) {
  const isPast = data.week < currentWeek;
  const isCurrent = data.week === currentWeek;
  const isFuture = data.week > currentWeek;

  return (
    <div
      style={{
        background: isCurrent ? "#1e3a5f" : "#0f172a",
        border: `1px solid ${isCurrent ? "#3b82f6" : isPast ? "#22c55e33" : "#1e293b"}`,
        borderRadius: 10,
        padding: "12px 16px",
        opacity: isFuture ? 0.45 : 1,
        position: "relative",
        overflow: "hidden",
      }}
    >
      {isCurrent && (
        <div
          style={{
            position: "absolute",
            top: 8, right: 10,
            background: "#3b82f6",
            color: "white",
            fontSize: 10,
            fontWeight: 700,
            padding: "2px 8px",
            borderRadius: 99,
            textTransform: "uppercase",
            letterSpacing: 0.5,
          }}
        >
          Active
        </div>
      )}
      {isPast && (
        <div
          style={{
            position: "absolute",
            top: 8, right: 10,
            color: "#22c55e",
            fontSize: 16,
          }}
        >
          ✓
        </div>
      )}
      <div style={{ color: "#64748b", fontSize: 11, marginBottom: 4 }}>Week {data.week}</div>
      <div style={{ color: "#f1f5f9", fontWeight: 700, fontSize: 14, marginBottom: 8 }}>{data.title}</div>
      <div style={{ display: "flex", gap: 6, flexWrap: "wrap" }}>
        {data.topics.map((t) => (
          <span
            key={t}
            style={{
              background: "#1e293b",
              color: "#94a3b8",
              fontSize: 10,
              padding: "2px 8px",
              borderRadius: 99,
              border: "1px solid #334155",
            }}
          >
            {t}
          </span>
        ))}
      </div>
    </div>
  );
}

export default function Dashboard({ xp = 0, currentWeek = 1 }) {
  return (
    <div
      style={{
        background: "#0a0f1e",
        color: "#f1f5f9",
        fontFamily: "'Inter', 'Segoe UI', sans-serif",
        minHeight: "100vh",
        padding: "32px 24px",
        maxWidth: 860,
        margin: "0 auto",
      }}
    >
      {/* Header */}
      <div style={{ display: "flex", alignItems: "center", gap: 16, marginBottom: 32 }}>
        <div style={{ fontSize: 40 }}>🏛️</div>
        <div>
          <h1 style={{ margin: 0, fontSize: 26, fontWeight: 800, color: "#f8fafc" }}>
            Architecture Academy
          </h1>
          <div style={{ color: "#64748b", fontSize: 14, marginTop: 2 }}>
            8-Week System Design Mastery Program
          </div>
        </div>
        <div
          style={{
            marginLeft: "auto",
            background: "#1e293b",
            border: "1px solid #334155",
            borderRadius: 10,
            padding: "8px 20px",
            textAlign: "center",
          }}
        >
          <div style={{ color: "#64748b", fontSize: 11, textTransform: "uppercase", letterSpacing: 1 }}>
            Week
          </div>
          <div style={{ color: "#facc15", fontWeight: 800, fontSize: 28, lineHeight: 1 }}>
            {currentWeek}
          </div>
          <div style={{ color: "#64748b", fontSize: 10 }}>of 8</div>
        </div>
      </div>

      {/* XP Bar */}
      <div
        style={{
          background: "#0f172a",
          border: "1px solid #1e293b",
          borderRadius: 12,
          padding: 20,
          marginBottom: 24,
        }}
      >
        <div style={{ color: "#64748b", fontSize: 12, textTransform: "uppercase", letterSpacing: 1, marginBottom: 12 }}>
          Progress
        </div>
        <XPBar xp={xp} />
        <div style={{ display: "flex", gap: 24, marginTop: 8 }}>
          <div>
            <div style={{ color: "#64748b", fontSize: 11 }}>Total XP</div>
            <div style={{ color: "#facc15", fontWeight: 700, fontSize: 20 }}>{xp}</div>
          </div>
          <div>
            <div style={{ color: "#64748b", fontSize: 11 }}>Correct Choices</div>
            <div style={{ color: "#22c55e", fontWeight: 700, fontSize: 20 }}>{Math.floor(xp / 15)}</div>
          </div>
          <div>
            <div style={{ color: "#64748b", fontSize: 11 }}>Days Studied</div>
            <div style={{ color: "#0ea5e9", fontWeight: 700, fontSize: 20 }}>1</div>
          </div>
        </div>
      </div>

      {/* System Diagram */}
      <div
        style={{
          background: "#0f172a",
          border: "1px solid #1e293b",
          borderRadius: 12,
          padding: 20,
          marginBottom: 24,
        }}
      >
        <div style={{ color: "#64748b", fontSize: 12, textTransform: "uppercase", letterSpacing: 1 }}>
          Your Growing System
        </div>
        <SystemDiagram week={currentWeek} />
      </div>

      {/* Curriculum */}
      <div
        style={{
          background: "#0f172a",
          border: "1px solid #1e293b",
          borderRadius: 12,
          padding: 20,
        }}
      >
        <div style={{ color: "#64748b", fontSize: 12, textTransform: "uppercase", letterSpacing: 1, marginBottom: 16 }}>
          Curriculum Roadmap
        </div>
        <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr", gap: 12 }}>
          {WEEKS.map((w) => (
            <WeekCard key={w.week} data={w} currentWeek={currentWeek} />
          ))}
        </div>
      </div>
    </div>
  );
}
