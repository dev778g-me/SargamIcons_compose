package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIBriefcase: ImageVector
    get() {
        if (_SiAIBriefcase != null) {
            return _SiAIBriefcase!!
        }
        _SiAIBriefcase = ImageVector.Builder(
            name = "Filled.SiAIBriefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.014f, 13.148f)
                curveToRelative(0.103f, 0.412f, 0.425f, 0.734f, 0.837f, 0.837f)
                lineToRelative(0.056f, 0.014f)
                lineToRelative(-0.056f, 0.015f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.837f, 0.837f)
                lineToRelative(-0.015f, 0.056f)
                lineToRelative(-0.014f, -0.056f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.837f, -0.837f)
                lineToRelative(-0.056f, -0.015f)
                lineToRelative(0.056f, -0.014f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.837f, -0.837f)
                lineToRelative(0.014f, -0.056f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.2f, 3f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4.8f)
                lineTo(16f, 7f)
                horizontalLineToRelative(3.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9.4f)
                verticalLineToRelative(9.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                lineTo(4.4f, 21f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.6f)
                lineTo(2f, 9.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.4f, 7f)
                lineTo(8f, 7f)
                lineTo(8f, 4.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.8f, 3f)
                close()
                moveTo(13.084f, 11.265f)
                curveToRelative(-0.35f, -1.02f, -1.82f, -1.021f, -2.169f, 0f)
                lineToRelative(-0.031f, 0.105f)
                lineToRelative(-0.303f, 1.211f)
                lineToRelative(-1.21f, 0.303f)
                curveToRelative(-1.162f, 0.29f, -1.162f, 1.94f, 0f, 2.231f)
                lineToRelative(1.21f, 0.302f)
                lineToRelative(0.303f, 1.213f)
                curveToRelative(0.29f, 1.16f, 1.94f, 1.16f, 2.231f, 0f)
                lineToRelative(0.303f, -1.212f)
                lineToRelative(1.212f, -0.303f)
                curveToRelative(1.16f, -0.29f, 1.16f, -1.94f, 0f, -2.231f)
                lineToRelative(-1.213f, -0.304f)
                lineToRelative(-0.302f, -1.21f)
                close()
                moveTo(10f, 7f)
                horizontalLineToRelative(4f)
                lineTo(14f, 5f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()

        return _SiAIBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIBriefcase: ImageVector? = null
