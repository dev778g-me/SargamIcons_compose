package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAIInventory: ImageVector
    get() {
        if (_SiAIInventory != null) {
            return _SiAIInventory!!
        }
        _SiAIInventory = ImageVector.Builder(
            name = "Duotone.SiAIInventory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(21f, 7f)
                verticalLineToRelative(11.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.07f, 21f, 3f, 19.93f, 3f, 18.6f)
                verticalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                verticalLineToRelative(11.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.07f, 21f, 3f, 19.93f, 3f, 18.6f)
                verticalLineTo(7f)
                moveToRelative(-0.4f, -4f)
                horizontalLineToRelative(18.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4.6f)
                verticalLineToRelative(0.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 7f)
                horizontalLineTo(2.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 5.4f)
                verticalLineToRelative(-0.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 3f)
                moveToRelative(9.012f, 8.552f)
                lineToRelative(-0.354f, 1.415f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.29f, 0.291f)
                lineToRelative(-1.416f, 0.354f)
                curveToRelative(-0.404f, 0.1f, -0.404f, 0.675f, 0f, 0.776f)
                lineToRelative(1.415f, 0.354f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.291f, 0.29f)
                lineToRelative(0.354f, 1.416f)
                curveToRelative(0.1f, 0.404f, 0.675f, 0.404f, 0.776f, 0f)
                lineToRelative(0.354f, -1.415f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, -0.291f)
                lineToRelative(1.416f, -0.354f)
                curveToRelative(0.404f, -0.1f, 0.404f, -0.675f, 0f, -0.776f)
                lineToRelative(-1.415f, -0.354f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.291f, -0.29f)
                lineToRelative(-0.354f, -1.416f)
                curveToRelative(-0.1f, -0.404f, -0.675f, -0.404f, -0.776f, 0f)
            }
        }.build()

        return _SiAIInventory!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIInventory: ImageVector? = null
