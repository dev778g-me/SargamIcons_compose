package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAIBriefcase: ImageVector
    get() {
        if (_SiAIBriefcase != null) {
            return _SiAIBriefcase!!
        }
        _SiAIBriefcase = ImageVector.Builder(
            name = "Duotone.SiAIBriefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(19.6f, 7f)
                horizontalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.4f)
                verticalLineToRelative(9.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 21f)
                horizontalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(9.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.6f, 7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7f)
                verticalLineTo(4.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineTo(9.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(7f)
                moveTo(4.4f, 7f)
                horizontalLineToRelative(15.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9.4f)
                verticalLineToRelative(9.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.6f)
                verticalLineTo(9.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.4f, 7f)
                moveToRelative(7.212f, 4.552f)
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

        return _SiAIBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIBriefcase: ImageVector? = null
