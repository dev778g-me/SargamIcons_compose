package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiCreditCardDetailed: ImageVector
    get() {
        if (_SiCreditCardDetailed != null) {
            return _SiCreditCardDetailed!!
        }
        _SiCreditCardDetailed = ImageVector.Builder(
            name = "Regular.SiCreditCardDetailed",
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
                moveTo(1f, 8f)
                horizontalLineToRelative(22f)
                moveTo(1f, 12f)
                horizontalLineToRelative(22f)
                moveToRelative(-3f, 3f)
                horizontalLineToRelative(-3f)
                moveTo(3.4f, 4f)
                horizontalLineToRelative(17.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6.4f)
                verticalLineToRelative(11.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(3.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 17.6f)
                verticalLineTo(6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 4f)
            }
        }.build()

        return _SiCreditCardDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiCreditCardDetailed: ImageVector? = null
