package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiCastleAlt1: ImageVector
    get() {
        if (_SiCastleAlt1 != null) {
            return _SiCastleAlt1!!
        }
        _SiCastleAlt1 = ImageVector.Builder(
            name = "Regular.SiCastleAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 8f)
                verticalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineToRelative(-2.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(6f)
                horizontalLineToRelative(-4f)
                verticalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineTo(6.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(8f)
                moveToRelative(12f, 0f)
                verticalLineToRelative(11.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                moveTo(18f, 8f)
                horizontalLineToRelative(4f)
                moveToRelative(-6.4f, 14f)
                horizontalLineTo(14f)
                moveToRelative(1.6f, 0f)
                horizontalLineToRelative(4f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(8f)
                moveToRelative(-8f, 14f)
                horizontalLineToRelative(-4f)
                moveToRelative(4f, 0f)
                verticalLineToRelative(-3.2f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineToRelative(-2.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(22f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.4f)
                moveToRelative(0f, 0f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19.6f)
                verticalLineTo(8f)
                moveToRelative(2.4f, 14f)
                horizontalLineTo(4.5f)
                curveTo(3.175f, 22f, 2f, 20.878f, 2f, 19.553f)
                verticalLineTo(8f)
                moveToRelative(4f, 0f)
                horizontalLineTo(2f)
                moveToRelative(20f, 0f)
                horizontalLineToRelative(1f)
                moveTo(2f, 8f)
                horizontalLineTo(1f)
                moveToRelative(10f, 2f)
                horizontalLineToRelative(2f)
                moveToRelative(-3f, 4f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _SiCastleAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiCastleAlt1: ImageVector? = null
