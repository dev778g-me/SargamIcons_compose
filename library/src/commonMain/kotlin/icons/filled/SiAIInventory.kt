package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIInventory: ImageVector
    get() {
        if (_SiAIInventory != null) {
            return _SiAIInventory!!
        }
        _SiAIInventory = ImageVector.Builder(
            name = "Filled.SiAIInventory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.014f, 12.65f)
                curveToRelative(0.103f, 0.411f, 0.425f, 0.733f, 0.837f, 0.836f)
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
                moveTo(21.4f, 2f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 4.6f)
                verticalLineToRelative(0.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 8f)
                lineTo(21f, 8f)
                verticalLineToRelative(10.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                lineTo(5.4f, 21f)
                curveTo(4.07f, 21f, 3f, 19.93f, 3f, 18.6f)
                lineTo(3f, 8f)
                horizontalLineToRelative(-0.4f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.4f)
                verticalLineToRelative(-0.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 2f)
                close()
                moveTo(13.084f, 10.766f)
                curveToRelative(-0.35f, -1.021f, -1.82f, -1.021f, -2.169f, 0f)
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
                moveTo(2.6f, 4f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 0.6f)
                verticalLineToRelative(0.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, 0.6f)
                horizontalLineToRelative(18.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, -0.6f)
                verticalLineToRelative(-0.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -0.6f)
                close()
            }
        }.build()

        return _SiAIInventory!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIInventory: ImageVector? = null
